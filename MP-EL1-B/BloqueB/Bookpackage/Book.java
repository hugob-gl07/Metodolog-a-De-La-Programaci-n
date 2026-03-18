
package BloqueB.Bookpackage;

import BloqueB.AuthorPackage.Author;

    public class Book { /** al igual que en otras clases book creamos las variables que vamos a usar con diferencia de que ahora hay mas de un autor, por lo que creamos un array de variables lo que permite mas de un valor en esa variable */
        private String name;
        private Author[] authors;
        private double price;
        private int qty = 0;


        public Book(String name, Author[] authors, double price, int qty) { /** le damos un valor a cada variable */
            this.name = name;
            this.authors = authors;
            this.price = price;
            this.qty = qty;
        }

        public String getName() { /** creamos los metodos que nos van a permirtir usar las variables */
            return name;
        }

        public Author[] getAuthors() {
            return authors;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public String getAuthorNames() { /** en este caso al ser un array de variables creamos un bucle para poder dar mas de un valor en funcion de i, la cual esta limitada por el n umero de autores, de forma eficiente */
            String names = "";
            for (int i = 0; i < authors.length; i++) {
                names += authors[i].getName();
                if (i < authors.length - 1) {
                    names += ", ";
                }
            }
            return names;
        }

        @Override
        public String toString() { /**creamos un string que une a los autores en una fila de trexto y luego los mete en los datos del libro */
            String authorsStr = "";
            for (int i = 0; i < authors.length; i++) {
                authorsStr += authors[i].toString();
                if (i < authors.length - 1) {
                    authorsStr += ", ";
                }
            }
            return "Book[name=" + name + ",authors={" + authorsStr + "},price=" + price + ",qty=" + qty + "]";
        }
    }

