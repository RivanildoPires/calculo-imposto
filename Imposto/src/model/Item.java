package model;

    public abstract class Item {
        private int codigo;
        private String descricao;
        private double valor;
        private double impostoCalculado;
        private double total;

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public void setImpostoCalculado(double impostoCalculado) {
            this.impostoCalculado = impostoCalculado;
        }

        public double getImpostoCalculado() {
            return impostoCalculado;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal() {
            this.total = getValor() + getImpostoCalculado();
        }


        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Item{");
            sb.append("codigo = ").append(codigo).append(", ");
            sb.append("descricao = '").append(descricao).append("', ");
            sb.append("valor = ").append(String.format("%.2f", valor)).append(", ");
            sb.append("impostoCalculado = ").append(String.format("%.2f", impostoCalculado)).append(", ");
            sb.append("total = ").append(String.format("%.2f", total));
            sb.append("}");
            return sb.toString();
        }
    }
