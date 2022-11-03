package services.software;

import io.ebean.PagedList;
import models.entities.Software;
import models.requests.CommonListRequest;
import models.responses.CommonListResponse;
import repository.SoftwareRepository;
import utils.models.ObjectReference;

import javax.inject.Inject;
import java.util.List;

public class SoftwareService {
    private SoftwareRepository softwareRepository;

    @Inject
    public SoftwareService(SoftwareRepository softwareRepository) {
        this.softwareRepository = softwareRepository;
    }

    public Software getDetail(Long id) throws Exception {
        return softwareRepository.getDetailSoftwareById(id);
    }

    public List<Software> getAllSoftware() throws Exception {
        return null;
    }

    public CommonListResponse getPageListSoftware(CommonListRequest commonListRequest) throws Exception {
        PagedList<Software> softwarePagedList = softwareRepository.getPageListSoftware(commonListRequest);
        CommonListResponse<Software> response = new CommonListResponse<Software>();
        response.setPage(softwarePagedList.getPageIndex());
        response.setPageSize(softwarePagedList.getPageSize());
        response.setFromXtoY(softwarePagedList.getDisplayXtoYofZ(" to ", " of " ));
        response.setHasNext(softwarePagedList.hasNext());
        response.setHasPrev(softwarePagedList.hasPrev());
        response.setItems(softwarePagedList.getList());
        response.setTotalCount(softwarePagedList.getTotalCount());

        return response;
    }

    public ObjectReference createSoftware(Software request) throws Exception {
        Software result = this.softwareRepository.createSoftware(request);

        ObjectReference objectReference = new ObjectReference();
        objectReference.setId(result.getId());
        objectReference.setMessage("created");
        objectReference.setStatus(true);

        return objectReference;
    }

    public ObjectReference updateSoftware(Software request) throws Exception {
        Boolean updateSoftware = this.softwareRepository.updateSoftware(request);

        ObjectReference response = new ObjectReference();
        response.setId(request.getId());
        response.setStatus(updateSoftware);

        return response;
    }

    public ObjectReference deleteSoftware(Software request) throws Exception {
        Boolean deleteSoftware = this.softwareRepository.deleteSoftWareById(request);

        ObjectReference response = new ObjectReference();
        response.setId(request.getId());
        response.setStatus(deleteSoftware);

        return response;
    }
}
