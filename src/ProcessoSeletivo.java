public class ProcessoSeletivo {
    private float salarioPretendido;

    public ProcessoSeletivo(float salarioPretendido) {
        this.salarioPretendido = salarioPretendido;
    }

    public void analisarCandidato() {
        float baseSalarial = 2000;

        if (baseSalarial > salarioPretendido) {
            System.out.println("ligar para o candidato.");
        } else if (baseSalarial == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando resultado de demais candidatos.");
        }
    }
}
