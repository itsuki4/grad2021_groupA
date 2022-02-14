
<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="UTF-8"%>

    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="base_css/css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
 <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="index.html">一時保護システム</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <!-- Navbar Search-->

            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">

                        <li><a class="dropdown-item" href="/grad2021_groupA/Shelter_mypageServlet?id=2000">mypage2000</a></li>
                       <!--  <li><a class="dropdown-item" href="/grad2021_groupA/Shelter_mypageServlet?id=2001">mypage2001</a></li> -->
                        <li><hr class="dropdown-divider" /></li>
                        <li><a class="dropdown-item" href="/grad2021_groupA/testC">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <div class="sb-sidenav-menu-heading">core</div>
                            <a class="nav-link" href="/grad2021_groupA/Person_Read">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                児童一覧
                            </a>
                            <div class="sb-sidenav-menu-heading">Interface</div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                施設検索
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="/grad2021_groupA/shelter_addServlet">都道府県検索</a>
                                    <a class="nav-link" href="/grad2021_groupA/shelterConditionServlet">情報検索</a>
                                </nav>

                            </div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                資料
                                <div class="sb-sidenav-collapse-arrow">><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    
                                    <a class="nav-link" href="/grad2021_groupA/InterviewRead">面談内容</a>
                                    <a class="nav-link" href="/grad2021_groupA/PersonRead">児相の詳細情報</a>
                                    <a class="nav-link" href="/grad2021_groupA/Browsing">健康状態</a>
                                    <a class="nav-link" href="/grad2021_groupA/Abuse_exceptRead">虐待以外</a>
                                </nav>

                            </div>


                        </div>
                    </div>
                    <div class="sb-sidenav-footer">
                        <div class="small">     </div>

                    </div>
                </nav>
            </div>
                        <div id="layoutSidenav_content">
                <main>

