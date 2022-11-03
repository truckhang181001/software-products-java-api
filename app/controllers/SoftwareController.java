package controllers;

import models.entities.Software;
import models.requests.CommonListRequest;
import models.responses.CommonListResponse;
import play.mvc.BodyParser;
import play.mvc.Http;
import play.mvc.Result;
import services.software.SoftwareService;
import utils.models.CommonException;
import utils.models.ObjectReference;

import javax.inject.Inject;

import java.util.List;

import static play.mvc.Results.ok;

public class SoftwareController extends BaseController {
    private SoftwareService softwareService;

    @Inject
    public SoftwareController(SoftwareService softwareService) {
        this.softwareService = softwareService;
    }

    public Result getAllSoftware(Http.Request request) throws Exception {
        List<Software> result = this.softwareService.getAllSoftware();
        return ok(result);
    }

    public Result getDetailSoftware(Http.Request request, Long id) throws Exception {
        if (id == null) {
            throw new CommonException("Id is required");
        }
        Software result = this.softwareService.getDetail(id);
        return this.ok(result);
    }

    public Result getListSoftware(Http.Request request, Integer page, Integer pageSize, String sortBy, String orderBy, String filter) throws Exception {
        CommonListRequest commonListRequest = new CommonListRequest();
        commonListRequest.setPage(page);
        commonListRequest.setPageSize(pageSize);
        commonListRequest.setSortBy(sortBy);
        commonListRequest.setOrderBy(orderBy);
        commonListRequest.setFilter(filter);

        CommonListResponse result = this.softwareService.getPageListSoftware(commonListRequest);
        return ok(result);
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result createSoftware(Http.Request request) throws Exception {
        Software software = this.getBody(request, Software.class);
        ObjectReference result = this.softwareService.createSoftware(software);
        return this.ok(result);
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result deleteSoftware(Http.Request request) throws Exception {
        Software software = this.getBody(request, Software.class);
        ObjectReference response = this.softwareService.deleteSoftware(software);

        return ok(response);
    }

    public Result updateSoftware(Http.Request request) throws Exception {
        Software software = this.getBody(request, Software.class);
        ObjectReference response = this.softwareService.updateSoftware(software);

        return ok(response);
    }
}
