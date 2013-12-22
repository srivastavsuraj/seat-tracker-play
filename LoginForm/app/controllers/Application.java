package controllers;

import model.Login;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.login;

public class Application extends Controller {
	static Form<Login> form = Form.form(Login.class);
	private static String userId = "";
	private static String password = "";

	public static Result index() {
		return redirect(routes.Application.login());

	}

	public static Result login() {
		if(session() != null){
			session().clear();
		}
		
		return ok(login.render(form));
	}

	public static Result authenticate() {
		Form<Login> loginForm = form.bindFromRequest();
		if (loginForm.hasErrors()) {
			return badRequest(login.render(loginForm));
		} else {
			session().clear();
			session("userid", loginForm.get().userid);
			userId = loginForm.get().userid;
			password = loginForm.get().password;
			System.out.println("User Name : " + userId);
			if ("".equals(password) || "".equals(userId)) {
				session().clear();
				flash("failed", "User id and Password must not be empty..");

				return badRequest(login.render(loginForm));
			}
			return redirect(routes.SeatAllocationDetailsController.showSeatDetails());
			
		}
	}

	public static Result welcome(String userName) {
		flash("success", "login successful.");
		return ok(views.html.welcome.render(userId));
	}

}
