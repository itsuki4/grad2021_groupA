
package tool;

import java.io.PrintWriter;

public class Page {

	public static void header(PrintWriter out) {
		out.println("   <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\r\n" +
				"        <link href=\"base_css/css/styles.css\" rel=\"stylesheet\" />\r\n" +
				"        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\" crossorigin=\"anonymous\"></script>\r\n" +
				" <body class=\"sb-nav-fixed\">\r\n" +
				"        <nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\r\n" +
				"            <!-- Navbar Brand-->\r\n" +
				"            <a class=\"navbar-brand ps-3\" href=\"index.html\">一時保護システム</a>\r\n" +
				"            <!-- Sidebar Toggle-->\r\n" +
				"            <button class=\"btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0\" id=\"sidebarToggle\" href=\"#!\"><i class=\"fas fa-bars\"></i></button>\r\n" +
				"            <!-- Navbar Search-->\r\n" +
				"          \r\n" +
				"            <!-- Navbar-->\r\n" +
				"            <ul class=\"navbar-nav ms-auto ms-md-0 me-3 me-lg-4\">\r\n" +
				"                <li class=\"nav-item dropdown\">\r\n" +
				"                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fas fa-user fa-fw\"></i></a>\r\n" +
				"                    <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">\r\n" +
				"\r\n" +
				"                        <li><a class=\"dropdown-item\" href=\"/grad2021_groupA/Shelter_mypageServlet?id=2000\">mypage2000</a></li>\r\n" +

				"                        <li><hr class=\"dropdown-divider\" /></li>\r\n" +
				"                        <li><a class=\"dropdown-item\" href=\"/grad2021_groupA/testC\">Logout</a></li>\r\n" +
				"                    </ul>\r\n" +
				"                </li>\r\n" +
				"            </ul>\r\n" +
				"        </nav>\r\n" +
				"        <div id=\"layoutSidenav\">\r\n" +
				"            <div id=\"layoutSidenav_nav\">\r\n" +
				"                <nav class=\"sb-sidenav accordion sb-sidenav-dark\" id=\"sidenavAccordion\">\r\n" +
				"                    <div class=\"sb-sidenav-menu\">\r\n" +
				"                        <div class=\"nav\">\r\n" +
				"                            <div class=\"sb-sidenav-menu-heading\">core</div>\r\n" +
				"                            <a class=\"nav-link\" href=\"/grad2021_groupA/testB\">" +
				"                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\r\n" +
				"                                home\r\n" +
				"                            </a>\r\n" +
				"                            <div class=\"sb-sidenav-menu-heading\">Interface</div>\r\n" +
				"                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseLayouts\" aria-expanded=\"false\" aria-controls=\"collapseLayouts\">\r\n" +
				"                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-columns\"></i></div>\r\n" +
				"                                施設検索\r\n" +
				"                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n" +
				"                            </a>\r\n" +
				"                            <div class=\"collapse\" id=\"collapseLayouts\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\r\n" +
				"                                <nav class=\"sb-sidenav-menu-nested nav\">\r\n" +
				"                                    <a class=\"nav-link\" href=\"/grad2021_groupA/shelter_addServlet\">都道府県検索</a>\r\n" +
				"                                    <a class=\"nav-link\" href=\"/grad2021_groupA/shelterConditionServlet\">情報検索</a>\r\n" +
				"                                </nav>\r\n" +
				"        \r\n" +
				"                            </div>\r\n" +
				"                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseLayouts\" aria-expanded=\"false\" aria-controls=\"collapseLayouts\">\r\n" +
				"                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-columns\"></i></div>\r\n" +
				"                                資料\r\n" +
				"                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n" +
				"                            </a>\r\n" +
				"                            <div class=\"collapse\" id=\"collapseLayouts\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\r\n" +
				"                                <nav class=\"sb-sidenav-menu-nested nav\">\r\n" +
				"                                    <a class=\"nav-link\" href=\"/grad2021_groupA/InterviewRead\">面談内容</a>\r\n" +
				"                                    <a class=\"nav-link\" href=\"/grad2021_groupA/PersonRead\">児童の詳細情報</a>\r\n" +
				"                                </nav>\r\n" +
				"        \r\n" +
				"                            </div>\r\n" +
				"                            \r\n" +
				"                            \r\n" +
				"                           \r\n" +
				"                        </div>\r\n" +
				"                    </div>\r\n" +
				"                    <div class=\"sb-sidenav-footer\">\r\n" +
				"                        <div class=\"small\">     </div>\r\n" +
				"                        " +
				"                    </div>\r\n" +
				"                </nav>\r\n" +
				"            </div>\r\n" +
				"                        <div id=\"layoutSidenav_content\">\r\n" +
				"                <main>"                    );
	}
	public static void footer(PrintWriter out) {
		out.println(
				"                <footer class=\"py-4 bg-light mt-auto\">\r\n" +
				"                    <div class=\"container-fluid px-4\">\r\n" +
				"                        <div class=\"d-flex align-items-center justify-content-between small\">\r\n" +
				"                            <div class=\"text-muted\">Copyright &copy; Your Website 2021</div>\r\n" +
				"                            <div>\r\n" +
				"                                <a href=\"#\">Privacy Policy</a>\r\n" +
				"                                &middot;\r\n" +
				"                                <a href=\"#\">Terms &amp; Conditions</a>\r\n" +
				"                            </div>\r\n" +
				"                        </div>\r\n" +
				"                    </div>\r\n" +
				"                </footer>\r\n" +
				"            </div>\r\n" +
				"        </div>\r\n" +
				"        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\r\n" +
				"        <script src=\"base_css/js/scripts.js\"></script>\r\n" +
				"        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js\" crossorigin=\"anonymous\"></script>\r\n" +
				"        <script src=\"base_css/assets/demo/chart-area-demo.js\"></script>\r\n" +
				"        <script src=\"base_css/assets/demo/chart-bar-demo.js\"></script>\r\n" +
				"        <script src=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest\" crossorigin=\"anonymous\"></script>\r\n" +
				"        <script src=\"base_css/js/datatables-simple-demo.js\"></script>\r\n" );
	}
}
