package org.exercicios.terceiraEntrega;

import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class OscarService {
    private final List<Indicacao> indicados = new ArrayList<>();

    public void adicionarIndicado(Indicavel indicavel, String categoria) {
        if (indicavel.isElegivel()) {
            indicavel.incrementarIndicacoes();
            Indicacao indicacao = new Indicacao();
            indicacao.setIndicavel(indicavel);
            indicacao.setCategoria(categoria);
            indicados.add(indicacao);
        }
    }

    public List<Indicacao> getIndicados() {
        return indicados;
    }

    public void persistirIndicados() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("indicados.txt"))) {
            for (Indicacao indicacao : indicados) {
                writer.write(indicacao.getIndicavel().getClass().getSimpleName() + ": " + indicacao.getCategoria());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}