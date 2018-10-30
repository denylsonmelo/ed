package br.edu.ifpi.capar.ed.assunto.listas;

/**
 *
 * @author seijuh
 */
public class Lista {

    private ElementoLista primeiro;
    private ElementoLista ultimo;
    private int total;

    public void adicionarEmQualquerLugar(Materia materiaNova, int posicao) throws Exception {

        if (posicao > totalElementos()) {
            throw new Exception("A posição solicitada é maior que o total de elementos");
        } else if (posicao < 0) {
            throw new Exception("A posição solicitada é negativa");
        } else if (posicao == 0) {
            this.adicionarNoInicio(materiaNova);
        } else if (posicao == totalElementos()) {
            this.adicionarNoFinal(materiaNova);
        } else {
            ElementoLista elementoNovo = new ElementoLista(materiaNova);

            ElementoLista elementoTemporarioAnteriorAtual = this.primeiro;
            ElementoLista elementoTemporarioAtual = this.primeiro.irParaProximo();
            for (int i = 1; i < posicao; i++) {
                elementoTemporarioAnteriorAtual = elementoTemporarioAtual;
                elementoTemporarioAtual = elementoTemporarioAtual.irParaProximo();
            }

            elementoNovo.definirProximo(elementoTemporarioAtual);
            elementoTemporarioAnteriorAtual.definirProximo(elementoNovo);
            this.total++;
        }
    }

    private void criarListaDoInicio(ElementoLista novoElemento) {
        this.primeiro = this.ultimo = novoElemento;
    }

    public int totalElementos() {
        return this.total;
    }

    public void adicionarNoInicio(Materia materiaNova) {
        ElementoLista elementoNovo = new ElementoLista(materiaNova);

        if (totalElementos() == 0) {
            this.criarListaDoInicio(elementoNovo);
        } else {
            ElementoLista elementoTemporario = this.primeiro;
            this.primeiro = elementoNovo;
            elementoNovo.definirProximo(elementoTemporario);
        }

        this.total++;
    }

    public void adicionarNoFinal(Materia materiaNova) {
        ElementoLista elementoNovo = new ElementoLista(materiaNova);

        if (totalElementos() == 0) {
            this.criarListaDoInicio(elementoNovo);
        } else {
            ElementoLista elementoTemporario = this.ultimo;
            this.ultimo = elementoNovo;
            elementoTemporario.definirProximo(elementoNovo);
        }

        this.total++;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= totalElementos()) {
            System.out.println("posicao invalida para a lista");
        } else if (posicao == 0) {
            this.removerInicio();
        } else {
            ElementoLista elementoTemporarioAnteriorAtual = this.primeiro;
            ElementoLista elementoTemporarioAtual = this.primeiro.irParaProximo();

            for (int i = 1; i < totalElementos(); i++) {
                System.out.print("entrei no for ... ");
                if (posicao == i) {

                    if (posicao == totalElementos() - 1) {
                        System.out.println("removendo do final");
                        this.ultimo = elementoTemporarioAnteriorAtual;
                        this.ultimo.definirProximo(null);
                    } else {
                        System.out.println("removendo da posicao " + i);
                        elementoTemporarioAnteriorAtual.definirProximo(elementoTemporarioAtual.irParaProximo());
                    }

                    this.total--;
                    break;
                } else {
                    elementoTemporarioAnteriorAtual = elementoTemporarioAtual;
                    elementoTemporarioAtual = elementoTemporarioAtual.irParaProximo();
                }

            }
        }
    }

    public void remover(Materia materia) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Tentando remover " + materia.getNome());
        if (this.primeiro != null && this.primeiro.getMateria().equals(materia)) {
            System.out.println("removendo do inicio");
            this.removerInicio();
        } else {
            ElementoLista elementoTemporarioAnteriorAtual = this.primeiro;
            ElementoLista elementoTemporarioAtual = this.primeiro.irParaProximo();

            for (int i = 1; i < totalElementos(); i++) {
                System.out.print("entrei no for ... ");
                if (elementoTemporarioAtual != null && elementoTemporarioAtual.getMateria().equals(materia)) {

                    if (elementoTemporarioAtual.equals(this.ultimo)) {
                        System.out.println("removendo do final");
                        this.ultimo = elementoTemporarioAnteriorAtual;
                        this.ultimo.definirProximo(null);
                    } else {

                        System.out.println("removendo da posicao " + i);
                        elementoTemporarioAnteriorAtual.definirProximo(elementoTemporarioAtual.irParaProximo());
                    }

                    this.total--;
                    break;
                } else {
                    elementoTemporarioAnteriorAtual = elementoTemporarioAtual;
                    elementoTemporarioAtual = elementoTemporarioAtual.irParaProximo();
                }

                System.out.println("nao removendo ... proximo");
            }
            System.out.println("saiu do laco de repeticao");
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    public void removerFinal() {
        // necessita de extrema refatoracao
        switch (totalElementos()) {
            case 0:
                System.out.println("lista esta vazia");
                break;
            case 1:
                this.primeiro = this.ultimo = null;
                this.total--;
                break;
            default:
                ElementoLista elementoTemporarioAnteriorAtual = this.primeiro;
                ElementoLista elementoTemporarioAtual = this.primeiro.irParaProximo();
                for (int i = 1; i < totalElementos(); i++) {
                    elementoTemporarioAnteriorAtual = elementoTemporarioAtual;
                    elementoTemporarioAtual = elementoTemporarioAtual.irParaProximo();
                }

                this.ultimo = elementoTemporarioAnteriorAtual;
                this.ultimo.definirProximo(null);
                this.total--;
        }
        //this.ultimo = this.ultimo.irParaAnterior();
        //this.ultimo.definirProximo(null);
    }

    public void removerInicio() {
        // necessita de extrema refatoracao
        switch (totalElementos()) {
            case 0:
                System.out.println("lista esta vazia");
                break;
            case 1:
                this.primeiro = this.ultimo = null;
                this.total--;
                break;
            default:
                this.primeiro = this.primeiro.irParaProximo();
                this.total--;
                break;
        }
    }

    public String imprimirLista() {
        StringBuilder builder = new StringBuilder("Lista[");

        if (this.primeiro != null) {
            builder.append(this.primeiro).append(", ");
            ElementoLista atual = this.primeiro.irParaProximo();
            for (int i = 1; i < totalElementos(); i++) {
                builder.append(atual).append(", ");
                atual = atual.irParaProximo();
            }
            builder.append("]");
            return builder.toString();
        }

        return "Lista Vazia !!!";
    }

    public void alterar(Materia antiga, Materia nova) {

    }

    public void alterar(int posicao, Materia nova) {

    }

    public void pesquisar(int posicao, Materia nova) {

    }
}
