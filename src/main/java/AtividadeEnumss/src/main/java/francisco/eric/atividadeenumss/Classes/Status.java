package francisco.eric.atividadeenumss.Classes;

    public enum  Status {
        PENDENTE("Seu produto está em preparação"),
        EM_ROTA("Seu pedido está em Rota"),
        ENTREGUE("Seu Pedido Chegou :)"),
        CANCELADO("Seu Pedido foi Cancelado :");

        private String descricao;

        Status(String descrição){
            this.descricao = descrição;
        }
        Status(){

        }

        public String getDescrição(){
            return descricao;
        }
    }


