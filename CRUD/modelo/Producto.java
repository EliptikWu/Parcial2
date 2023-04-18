package CRUD.modelo;

public class Producto {
        public Integer Id;
        private String productName;
        private String description;
        private String status;

        public Producto(Integer id, String productName, String description, String status) {
            Id = id;
            this.productName = productName;
            this.description = description;
            this.status = status;
        }

        public Integer getId() {
            return Id;
        }

        public void setId(Integer id) {
            id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Product ->" +
                    "Id= " + Id +
                    ", Product Name= " + productName + '\'' +
                    ", Description= " + description + '\'' +
                    ", Status " + status ;
        }
}

