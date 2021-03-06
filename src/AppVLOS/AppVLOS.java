package AppVLOS;

import Hardware.*;
import VLOS.VLOS;
import VLOS.ModoSistema;

public class AppVLOS {

    public static void main(String args[]) {

        System.out.println("");
        System.out.println("UnB 2020.01 - ISO");
        System.out.println("");
        System.out.println("\t Aluno : Luan Freitas      -  17/0003191");
        System.out.println("\t Aluno : Vinicius Martins  -  17/0157962");
        System.out.println("");

        ModoSistema mModo = ModoSistema.INTERFACE;


        // MONTANDO A MAQUINA i368 COM O PROCESSADOR x86
        Maquina_i368 mMaquina = new Maquina_i368();


        // ADICIONANDO HARDWARE A MAQUINA
        mMaquina.adicionarDispositivo(new Memoria("HX434C16FB3AK4", (1024) * 1024 * 1024));
        mMaquina.adicionarDispositivo(new SATA("ST2000DM008", 500 * 1024 * 1024));
        mMaquina.adicionarDispositivo(new SATA("WD20PURX", 200 * 1024 * 1024));
        mMaquina.adicionarDispositivo(new Impressora("Ink Tank 416 Z4B55A HP"));
        mMaquina.adicionarDispositivo(new Impressora("Deskjet Ink Advantage 2376 7WQ02A HP"));
        mMaquina.adicionarDispositivo(new Scanner("Avision FB5000"));
        mMaquina.adicionarDispositivo(new Modem("Mercusys MW301R"));
        mMaquina.adicionarDispositivo(new Modem("TP-Link AC1200"));


        // INSTALA SISTEMA OPERACIONAL VLOS NA MAQUINA i368
        VLOS mVLOS = new VLOS(mMaquina);

        if (mModo == ModoSistema.TERMINAL) {

            // LIGANDO A MAQUINA i368 com VLOS - MODO TERMINAL

            mVLOS.executarTerminal();

        } else if (mModo == ModoSistema.INTERFACE) {

            // LIGANDO A MAQUINA i368 com VLOS - MODO INTERFACE GRAFICA

            mVLOS.executarInterface();

        } else {

            System.out.println(" -->> MODO : DESCONHECIDO !");
        }


    }

}
