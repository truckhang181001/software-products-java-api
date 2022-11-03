// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  HomeController_0: controllers.HomeController,
  // @LINE:5
  SoftwareController_1: controllers.SoftwareController,
  // @LINE:13
  CompanyController_2: controllers.CompanyController,
  // @LINE:17
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    HomeController_0: controllers.HomeController,
    // @LINE:5
    SoftwareController_1: controllers.SoftwareController,
    // @LINE:13
    CompanyController_2: controllers.CompanyController,
    // @LINE:17
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_0, SoftwareController_1, CompanyController_2, Assets_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, SoftwareController_1, CompanyController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/detail""", """controllers.SoftwareController.getDetailSoftware(request:Request, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/list""", """controllers.SoftwareController.getListSoftware(request:Request, page:Int, pageSize:Int, sortBy:String, orderBy:String, filter:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/all""", """controllers.SoftwareController.getAllSoftware(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/create""", """controllers.SoftwareController.createSoftware(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/update""", """controllers.SoftwareController.updateSoftware(request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/delete""", """controllers.SoftwareController.deleteSoftware(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/company/all-option""", """controllers.CompanyController.getAllCompanyOption(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Default""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_SoftwareController_getDetailSoftware1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/detail")))
  )
  private[this] lazy val controllers_SoftwareController_getDetailSoftware1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_1.getDetailSoftware(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "getDetailSoftware",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "GET",
      this.prefix + """api/client/software/detail""",
      """ Software RESTful API""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_SoftwareController_getListSoftware2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/list")))
  )
  private[this] lazy val controllers_SoftwareController_getListSoftware2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_1.getListSoftware(fakeValue[play.mvc.Http.Request], fakeValue[Int], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "getListSoftware",
      Seq(classOf[play.mvc.Http.Request], classOf[Int], classOf[Int], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """api/client/software/list""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_SoftwareController_getAllSoftware3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/all")))
  )
  private[this] lazy val controllers_SoftwareController_getAllSoftware3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_1.getAllSoftware(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "getAllSoftware",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/client/software/all""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_SoftwareController_createSoftware4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/create")))
  )
  private[this] lazy val controllers_SoftwareController_createSoftware4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_1.createSoftware(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "createSoftware",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/client/software/create""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_SoftwareController_updateSoftware5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/update")))
  )
  private[this] lazy val controllers_SoftwareController_updateSoftware5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_1.updateSoftware(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "updateSoftware",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """api/client/software/update""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SoftwareController_deleteSoftware6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/delete")))
  )
  private[this] lazy val controllers_SoftwareController_deleteSoftware6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_1.deleteSoftware(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "deleteSoftware",
      Seq(classOf[play.mvc.Http.Request]),
      "DELETE",
      this.prefix + """api/client/software/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CompanyController_getAllCompanyOption7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/company/all-option")))
  )
  private[this] lazy val controllers_CompanyController_getAllCompanyOption7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CompanyController_2.getAllCompanyOption(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CompanyController",
      "getAllCompanyOption",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/client/company/all-option""",
      """ Company RESTful API""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
    Assets_3.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:5
    case controllers_SoftwareController_getDetailSoftware1_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_SoftwareController_getDetailSoftware1_invoker.call(
          req => SoftwareController_1.getDetailSoftware(req, id))
      }
  
    // @LINE:6
    case controllers_SoftwareController_getListSoftware2_route(params@_) =>
      call(params.fromQuery[Int]("page", None), params.fromQuery[Int]("pageSize", None), params.fromQuery[String]("sortBy", None), params.fromQuery[String]("orderBy", None), params.fromQuery[String]("filter", None)) { (page, pageSize, sortBy, orderBy, filter) =>
        controllers_SoftwareController_getListSoftware2_invoker.call(
          req => SoftwareController_1.getListSoftware(req, page, pageSize, sortBy, orderBy, filter))
      }
  
    // @LINE:7
    case controllers_SoftwareController_getAllSoftware3_route(params@_) =>
      call { 
        controllers_SoftwareController_getAllSoftware3_invoker.call(
          req => SoftwareController_1.getAllSoftware(req))
      }
  
    // @LINE:8
    case controllers_SoftwareController_createSoftware4_route(params@_) =>
      call { 
        controllers_SoftwareController_createSoftware4_invoker.call(
          req => SoftwareController_1.createSoftware(req))
      }
  
    // @LINE:9
    case controllers_SoftwareController_updateSoftware5_route(params@_) =>
      call { 
        controllers_SoftwareController_updateSoftware5_invoker.call(
          req => SoftwareController_1.updateSoftware(req))
      }
  
    // @LINE:10
    case controllers_SoftwareController_deleteSoftware6_route(params@_) =>
      call { 
        controllers_SoftwareController_deleteSoftware6_invoker.call(
          req => SoftwareController_1.deleteSoftware(req))
      }
  
    // @LINE:13
    case controllers_CompanyController_getAllCompanyOption7_route(params@_) =>
      call { 
        controllers_CompanyController_getAllCompanyOption7_invoker.call(
          req => CompanyController_2.getAllCompanyOption(req))
      }
  
    // @LINE:17
    case controllers_Assets_at8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(Assets_3.at(path, file))
      }
  }
}
