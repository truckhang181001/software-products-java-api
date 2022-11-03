package controllers;

import play.mvc.Http;
import play.mvc.Result;
import services.company.CompanyService;

import javax.inject.Inject;

public class CompanyController extends BaseController{

    private CompanyService companyService;

    @Inject
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    public Result getAllCompanyOption(Http.Request request){
        return this.ok(companyService.getAllCompanyOption());
    }
}
