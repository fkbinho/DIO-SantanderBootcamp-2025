public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado.");
        } else if (marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Não é possível desligar o carro. Reduza a velocidade e coloque em ponto morto.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
            return;
        }

        if (!velocidadePermitida(marcha, velocidade + 1)) {
            System.out.println("Velocidade não permitida para a marcha atual.");
            return;
        }

        if (velocidade < 120) {
            velocidade++;
            System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Velocidade máxima atingida. Não é possível acelerar mais.");
        }
    }

    public void frear() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade > 0) {
            velocidade--;
            System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando à " + direcao + "...");
        } else {
            System.out.println("A manobra só pode ser feita entre 1 km/h e 40 km/h.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida.");
            return;
        }

        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Você só pode trocar uma marcha por vez.");
            return;
        }

        if (!velocidadePermitida(novaMarcha, velocidade)) {
            System.out.println("Velocidade incompatível com a marcha desejada.");
            return;
        }

        marcha = novaMarcha;
        System.out.println("Marcha alterada para: " + marcha);
    }

    public void mostrarVelocidade() {
        if (ligado) {
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    private boolean velocidadePermitida(int marcha, int velocidade) {
        return switch (marcha) {
            case 0 -> velocidade == 0;
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 20 && velocidade <= 40;
            case 3 -> velocidade >= 40 && velocidade <= 60;
            case 4 -> velocidade >= 60 && velocidade <= 80;
            case 5 -> velocidade >= 80 && velocidade <= 100;
            case 6 -> velocidade >= 100 && velocidade <= 120;
            default -> false;
        };
    }
}