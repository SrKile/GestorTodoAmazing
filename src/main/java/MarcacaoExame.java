public class MarcacaoExame {
    private boolean exameFeito;
    private String tipoCategoria;
    private String horas;

    private String nomeAluno;

    private String nomeInstrutor;

    private boolean exameMarcado;

    private boolean proposto;

    public MarcacaoExame() {

        this.exameFeito = false;
        this.exameMarcado = false;
    }


    private boolean isExameMarcado(){
        return exameMarcado;
    }
}
