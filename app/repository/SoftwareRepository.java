package repository;

import io.ebean.DB;
import io.ebean.PagedList;
import models.entities.Software;
import models.requests.CommonListRequest;

import java.util.List;
import java.util.Optional;

public class SoftwareRepository {
    public Software getDetailSoftwareById(Long id) throws Exception {
        Optional<Software> software = DB.find(Software.class)
                .setId(id)
                .findOneOrEmpty();
        return software.isPresent() ? software.get() : null;
    }

    public List<Software> getAllSoftware(){
        List<Software> softwareList = DB.find(Software.class)
                .findList();
        return softwareList;
    }

    public PagedList<Software> getPageListSoftware(CommonListRequest commonListRequest) throws Exception {
        PagedList<Software> result = DB.find(Software.class)
                .where()
                .ilike("name", "%" + commonListRequest.getFilter() + "%")
                .orderBy(commonListRequest.getSortBy() + " " + commonListRequest.getOrderBy())
                .setFirstRow(commonListRequest.getPage() * commonListRequest.getPageSize())
                .setMaxRows(commonListRequest.getPageSize())
                .findPagedList();
        return result;
    }

    public Software createSoftware(Software software) throws Exception {
        software.setId(System.currentTimeMillis());
        DB.insert(software);
        return software;
    }

    public Boolean updateSoftware(Software newSoftware) throws Exception {
        Optional<Software> optionalSoftware = DB.find(Software.class).setId(newSoftware.getId()).findOneOrEmpty();
        if (optionalSoftware.isPresent()) {
            Software software = optionalSoftware.get();

            //Update if it's not null
            if (newSoftware.getName() != null){
                software.setName(newSoftware.getName());
            }
            if(newSoftware.getCompany().getId() != null){
                software.getCompany().setId(newSoftware.getCompany().getId());
            }
            if (newSoftware.getIntroduced() != null){
                software.setIntroduced(newSoftware.getIntroduced());
            }
            if(newSoftware.getDiscontinued() != null){
                software.setDiscontinued(newSoftware.getDiscontinued());
            }

            software.update();
            return true;
        }
        return false;
    }

    public Boolean deleteSoftWareById(Software software) throws Exception {
        Optional<Software> optionalSoftware = DB.find(Software.class)
                .setId(software.getId())
                .findOneOrEmpty();
        if (optionalSoftware.isPresent()) {
            return DB.delete(software);
        }
        return false;
    }
}
