package services.company;

import repository.CompanyRepository;

import javax.inject.Inject;
import java.util.Map;

public class CompanyService {
    private CompanyRepository companyRepository;

    @Inject
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Map<String, String> getAllCompanyOption(){
        return companyRepository.options();
    }
}
