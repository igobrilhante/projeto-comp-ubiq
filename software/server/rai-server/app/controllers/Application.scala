package controllers

import play.api._
import play.api.mvc._
import play.api.templates.Html

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Hello World"))
  }
  
//  def main = Action {
//    Ok(views.html.main("Recomenda Ai"))
//  }
  
}