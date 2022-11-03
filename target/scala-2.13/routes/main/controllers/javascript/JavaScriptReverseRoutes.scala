// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:2
package controllers.javascript {

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseSoftwareController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def getDetailSoftware: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SoftwareController.getDetailSoftware",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/client/software/detail" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:6
    def getListSoftware: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SoftwareController.getListSoftware",
      """
        function(page0,pageSize1,sortBy2,orderBy3,filter4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/client/software/list" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("page", page0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("pageSize", pageSize1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortBy", sortBy2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderBy", orderBy3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("filter", filter4)])})
        }
      """
    )
  
    // @LINE:9
    def updateSoftware: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SoftwareController.updateSoftware",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/client/software/update"})
        }
      """
    )
  
    // @LINE:10
    def deleteSoftware: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SoftwareController.deleteSoftware",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/client/software/delete"})
        }
      """
    )
  
    // @LINE:8
    def createSoftware: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SoftwareController.createSoftware",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/client/software/create"})
        }
      """
    )
  
    // @LINE:7
    def getAllSoftware: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SoftwareController.getAllSoftware",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/client/software/all"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseCompanyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def getAllCompanyOption: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CompanyController.getAllCompanyOption",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/client/company/all-option"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
