    public abstract  class Animal {
        protected String nome;

        public Animal(String nome) {
        }

        public String getNome(String nome) {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }



        public abstract void Correr();

        public abstract void Fazersom();

        public abstract void Comer();

        public abstract void Voar();

    }