package com.czb.privatetutor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName AdminController
 * @Date 2019/12/31
 * @Version V1.0
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/index")
    public String index(){
        return "/admin/index";
    }

    @RequestMapping("/compact_sidebar")
    public String compact_sidebar(){
        return "/admin/compact-sidebar";
    }

    @RequestMapping("/icon_menu")
    public String icon_menu(){
        return "/admin/icon-menu";
    }

    @RequestMapping("/overlay_sidebar")
    public String overlay_sidebar(){
        return "/admin/overlay-sidebar";
    }

    @RequestMapping("/sidebar_style_1")
    public String sidebar_style(){
        return "/admin/sidebar-style-1";
    }

    @RequestMapping("/starter_template")
    public String starter_template(){
        return "/admin/starter-template";
    }

    @RequestMapping("/static_sidebar")
    public String static_sidebar(){
        return "/admin/static-sidebar";
    }

    @RequestMapping("/widgets")
    public String widgets(){
        return "/admin/widgets";
    }

    @RequestMapping("/charts")
    public String charts(){
        return "/admin/charts/charts";
    }

    @RequestMapping("/sparkline")
    public String sparkline(){
        return "/admin/charts/sparkline";
    }

    @RequestMapping("/avatars")
    public String avatars(){
        return "/admin/components/avatars";
    }

    @RequestMapping("/buttons")
    public String buttons(){
        return "/admin/components/buttons";
    }

    @RequestMapping("/flaticons")
    public String flaticons(){
        return "/admin/components/flaticons";
    }

    @RequestMapping("/font_awesome_icons")
    public String font_awesome_icons(){
        return "/admin/components/font-awesome-icons";
    }

    @RequestMapping("/gridsystem")
    public String gridsystem(){
        return "/admin/components/gridsystem";
    }

    @RequestMapping("/notifications")
    public String notifications(){
        return "/admin/components/notifications";
    }

    @RequestMapping("/panels")
    public String panels(){
        return "/admin/components/panels";
    }

    @RequestMapping("/simple_line_icons")
    public String simple_line_icons(){
        return "/admin/components/simple-line-icons";
    }

    @RequestMapping("/sweetalert")
    public String sweetalert(){
        return "/admin/components/sweetalert";
    }

    @RequestMapping("/typography")
    public String typography(){
        return "/admin/components/typography";
    }

    @RequestMapping("/forms")
    public String forms(){
        return "/admin/forms/forms";
    }

    @RequestMapping("/jqvmap")
    public String jqvmap(){
        return "/admin/maps/jqvmap";
    }

    @RequestMapping("/datatables")
    public String datatables(){
        return "/admin/tables/datatables";
    }

    @RequestMapping("/tables")
    public String tables(){
        return "/admin/tables/tables";
    }
}
