package com.company;

public class Main {

    public static void main(String[] args) {
    //Creo el evento
    NonVivoGroup eventoLaChiqui = new NonVivoGroup();

    //Creo los invitados Standards
    InvitadoStandard invitadoStd1 = new InvitadoStandard("Carlos",111111);
    InvitadoStandard invitadoStd4 = new InvitadoStandard("Carlos",111111);
    InvitadoStandard invitadoStd2 = new InvitadoStandard("Juan",222222);
    InvitadoStandard invitadoStd3 = new InvitadoStandard("Ana",222222);

    //Creo los invitaods de Digital House
    InvitadoDH invitadoDH1 = new InvitadoDH("Pat",444444);
    InvitadoDH invitadoDH2 = new InvitadoDH("Jose",555555);
    InvitadoDH invitadoDH3 = new InvitadoDH("Lopi",666666);

    ///Creo los fuegos artificiales declarando sólo el ruido que hacen
    FuegoArtificial fuegoArt1 = new FuegoArtificial("boom");
    FuegoArtificial fuegoArt2 = new FuegoArtificial("baaam");
    FuegoArtificial fuegoArt3 = new FuegoArtificial("Kaboom");
    FuegoArtificial fuegoArt4 = new FuegoArtificial("plooo");
    FuegoArtificial fuegoArt5 = new FuegoArtificial("pop");
    FuegoArtificial fuegoArt6 = new FuegoArtificial("KABAAAAMMMM");

    //Creo los packs
    Packs pack1 = new Packs();
    Packs pack2 = new Packs();
    Packs pack3 = new Packs();

    //Añado a los packs fuegos artificiales y/u otros packs
    pack1.añadirPacksExplotables(fuegoArt2);
    pack1.añadirPacksExplotables(fuegoArt1);
    pack1.añadirPacksExplotables(fuegoArt3);
    pack2.añadirPacksExplotables(fuegoArt4);
    pack2.añadirPacksExplotables(fuegoArt5);
    pack3.añadirPacksExplotables(pack1);

    //Le pido al evento que añada los invitados a la lista de invitados
    eventoLaChiqui.añadirALaListaDeInvitados(invitadoDH1);
    eventoLaChiqui.añadirALaListaDeInvitados(invitadoStd1);
    eventoLaChiqui.añadirALaListaDeInvitados(invitadoStd2);
    eventoLaChiqui.añadirALaListaDeInvitados(invitadoDH2);
    eventoLaChiqui.añadirALaListaDeInvitados(invitadoStd3);
    eventoLaChiqui.añadirALaListaDeInvitados(invitadoDH3);
    eventoLaChiqui.añadirALaListaDeInvitados(invitadoStd3);

    //añado a la lista de explotables lo que quiero que explote
    eventoLaChiqui.añadirALaListaDeExplotables(pack1);
    eventoLaChiqui.añadirALaListaDeExplotables(pack2);
    eventoLaChiqui.añadirALaListaDeExplotables(pack3);
    eventoLaChiqui.añadirALaListaDeExplotables(fuegoArt1);
    eventoLaChiqui.añadirALaListaDeExplotables(fuegoArt5);
    eventoLaChiqui.añadirALaListaDeExplotables(fuegoArt3);
    eventoLaChiqui.añadirALaListaDeExplotables(fuegoArt6);


    //le pido al evento que cuando encienda las velas ejecute los metódos de explotar y comer torta
    eventoLaChiqui.encenderVelas();
    }
}
