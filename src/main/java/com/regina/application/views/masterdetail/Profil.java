package com.regina.application.views.masterdetail;

import com.regina.application.views.MainLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "Login/:samplePersonID?/:action?(edit)", layout = MainLayout.class)
public class Profil extends VerticalLayout {
    public Profil(){

    }
}
