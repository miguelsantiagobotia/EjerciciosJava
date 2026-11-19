package Herencia;


    // ===== Clase padre =====
    class Figura {
        protected String color;

        public Figura(String color) {
            this.color = color;
        }

        public double calcularArea() {
            return 0; // Será sobrescrito por las hijas
        }

        public String getColor() {
            return color;
        }

        // Reto extra: un solo método que sirve para todas las figuras
        public void describir() {
            String tipo = getClass().getSimpleName(); // "Circulo", "Rectangulo", "Triangulo"
            System.out.printf("%s %s - Área: %.2f%n", tipo, color, calcularArea());
        }
    }

    // ===== Clase hija Circulo =====
    class Circulo extends Figura {
        private double radio;

        public Circulo(String color, double radio) {
            super(color);
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    // ===== Clase hija Rectangulo =====
    class Rectangulo extends Figura {
        private double ancho;
        private double alto;

        public Rectangulo(String color, double ancho, double alto) {
            super(color);
            this.ancho = ancho;
            this.alto = alto;
        }

        @Override
        public double calcularArea() {
            return ancho * alto;
        }
    }

    // ===== Clase hija Triangulo (reto) =====
    class Triangulo extends Figura {
        private double base;
        private double altura;

        public Triangulo(String color, double base, double altura) {
            super(color);
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }
    }

