package Testes;

import VLOS.Despachante.ItemDespachante;

import java.util.ArrayList;

public class Teste_Alpha {

    // CLASSE RESPONSAVEL POR CRIAR TESTES ESPECIFICOS
    //
    // testeProcessosEmTempos                           ->  Cria Processos em Tempos diferentes
    // testeProcessosSimultaneos                        ->  Cria Processos Simultaneos em Tempos diferentes
    // testeProcessosSimultaneosNoMesmoTempo            ->  Cria Processos Simultaneos no mersmo Tempo
    // testeProcessosSimultaneosEmTemposDiferentes      ->  Cria Processos Simultaneos em Tempos diferentes
    // testeProcessosPrioritariosNoMesmoTempo           ->  Cria Processos Prioritarios no mesmo Tempo
    // testeProcessosSimultaneosMultiplasFilas          ->  Cria Processos Simultaneos em Tempos diferentes e em Multiplas Filas


    public void testeProcessosEmTempos(ArrayList<ItemDespachante> mDespachantes) {

        mDespachantes.clear();
        adicionarProcessoUsuarioEmFila(mDespachantes, 1, 3, 0, 2);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 5, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 3, 2, 0, 1);
        adicionarProcessoUsuarioEmFila(mDespachantes, 4, 4, 0, 5);


    }

    public void testeProcessosSimultaneosNoMesmoTempo(ArrayList<ItemDespachante> mDespachantes) {

        mDespachantes.clear();
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 3, 0, 2);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 5, 0, 2);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 5, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 2, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 3, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 7, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 2, 0, 1);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 4, 0, 5);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 3, 0, 5);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 1, 0, 5);


    }

    public void testeProcessosSimultaneosEmTemposDiferentes(ArrayList<ItemDespachante> mDespachantes) {

        mDespachantes.clear();
        adicionarProcessoUsuarioEmFila(mDespachantes, 1, 3, 0, 2);
        adicionarProcessoUsuarioEmFila(mDespachantes, 1, 5, 0, 2);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 5, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 2, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 3, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 7, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 3, 2, 0, 1);
        adicionarProcessoUsuarioEmFila(mDespachantes, 4, 4, 0, 5);
        adicionarProcessoUsuarioEmFila(mDespachantes, 4, 3, 0, 5);
        adicionarProcessoUsuarioEmFila(mDespachantes, 4, 1, 0, 5);


    }


    public void testeProcessosSimultaneosMultiplasFilasPrioritarias(ArrayList<ItemDespachante> mDespachantes) {

        mDespachantes.clear();
        adicionarProcessoUsuarioEmFila(mDespachantes, 1, 3, 0, 2);
        adicionarProcessoUsuarioEmFila(mDespachantes, 1, 5, 0, 2);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 5, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 2, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 3, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 7, 0, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 3, 2, 0, 1);
        adicionarProcessoUsuarioEmFila(mDespachantes, 4, 4, 0, 5);
        adicionarProcessoUsuarioEmFila(mDespachantes, 4, 3, 0, 7);
        adicionarProcessoUsuarioEmFila(mDespachantes, 4, 1, 0, 5);


        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 3, 1, 2);
        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 1, 3, 4);

        adicionarProcessoUsuarioEmFila(mDespachantes, 1, 4, 2, 5);
        adicionarProcessoUsuarioEmFila(mDespachantes, 4, 5, 1, 8);

        adicionarProcessoUsuarioEmFila(mDespachantes, 2, 5, 3, 5);
        adicionarProcessoUsuarioEmFila(mDespachantes, 3, 1, 3, 9);

        adicionarProcessoUsuarioEmFila(mDespachantes, 4, 1, 6, 5);
        adicionarProcessoUsuarioEmFila(mDespachantes, 5, 1, 5, 10);
        adicionarProcessoUsuarioEmFila(mDespachantes, 5, 3, 1, 12);

        adicionarProcessoUsuarioEmFila(mDespachantes, 6, 3, 2, 12);
        adicionarProcessoUsuarioEmFila(mDespachantes, 7, 3, 8, 50);
        adicionarProcessoUsuarioEmFila(mDespachantes, 9, 2, 4, 4);
        adicionarProcessoUsuarioEmFila(mDespachantes, 10, 6, 5, 5);

    }

    public void testeProcessosPrioritariosNoMesmoTempo(ArrayList<ItemDespachante> mDespachantes) {

        mDespachantes.clear();
        adicionarProcessoUsuarioEmFila(mDespachantes, 1, 3, 5, 2);
        adicionarProcessoUsuarioEmFila(mDespachantes, 1, 5, 3, 3);
        adicionarProcessoUsuarioEmFila(mDespachantes, 1, 2, 1, 1);
        adicionarProcessoUsuarioEmFila(mDespachantes, 1, 4, 0, 5);


    }

    private void adicionarProcessoUsuarioEmFila(ArrayList<ItemDespachante> mDespachantes, int eTempo, int eTamanho, int ePrioridade, int eBlocos) {

        ItemDespachante eItem = new ItemDespachante();
        eItem.setInicializacao(eTempo);
        eItem.setTempoProcessador(eTamanho);
        eItem.setPrioridade(ePrioridade);
        eItem.setBlocos(eBlocos);

        mDespachantes.add(eItem);

    }
}