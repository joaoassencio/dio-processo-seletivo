import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    private float salarioPretendido;
    float baseSalarial = 2000;

    public ProcessoSeletivo(float salarioPretendido) {
        this.salarioPretendido = salarioPretendido;
    }

    public void analisarCandidato() {
        if (baseSalarial > salarioPretendido) {
            System.out.println("ligar para o candidato.");
        } else if (baseSalarial == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando resultado de demais candidatos.");
        }
    }

    private static float valorPretendido() {
        return ThreadLocalRandom.current().nextFloat(1800, 2200);
    }

    public void selecionarCandidato() {
        String[] candidatos = {"João", "Jéssica", "Guilherme", "Débora", "Tavito", "Paulo", "Letícia", "Nicolas", "Giselle", "Lucas"};
        int candidatosSelecionados = 0;
        int indiceCandidatos = 0;

        while (candidatosSelecionados < 5) {
            String candidato = candidatos[indiceCandidatos];
            salarioPretendido = valorPretendido();

            System.out.printf(candidato + " solicitou o valor R$ %.2f\n", salarioPretendido);

            if (baseSalarial >= salarioPretendido) {
                System.out.println(candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            } else {
                System.out.println(candidato + " não foi selecionado para a vaga.");
            }
            indiceCandidatos++;
        }
    }
}
