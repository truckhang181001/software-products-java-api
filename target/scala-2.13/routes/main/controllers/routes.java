// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSoftwareController SoftwareController = new controllers.ReverseSoftwareController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCompanyController CompanyController = new controllers.ReverseCompanyController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSoftwareController SoftwareController = new controllers.javascript.ReverseSoftwareController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCompanyController CompanyController = new controllers.javascript.ReverseCompanyController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
