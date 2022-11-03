// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:5
  class ReverseSoftwareController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def getDetailSoftware(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/client/software/detail" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:6
    def getListSoftware(page:Int, pageSize:Int, sortBy:String, orderBy:String, filter:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/client/software/list" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("pageSize", pageSize)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortBy", sortBy)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderBy", orderBy)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:9
    def updateSoftware(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/client/software/update")
    }
  
    // @LINE:10
    def deleteSoftware(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/client/software/delete")
    }
  
    // @LINE:8
    def createSoftware(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/client/software/create")
    }
  
    // @LINE:7
    def getAllSoftware(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/client/software/all")
    }
  
  }

  // @LINE:13
  class ReverseCompanyController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def getAllCompanyOption(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/client/company/all-option")
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
