package shupeyko.api.dto;

public class OrderDetailsDto {
    private String address;
    private static String phone;

/*    public String getAddress() {
        return address;
    }*/

    public OrderDetailsDto() {
    }

    public OrderDetailsDto(String samara, String s) {

    }

    public String getId() {
        return address;
    }

    public String getFirstName() {
        return phone;
    }


    public static OrderDetailsDto.Builder createBuilder() {
        return new OrderDetailsDto.Builder();
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {

        private final OrderDetailsDto person;
        private String address;
        private String phone;

        private Builder() {
            this.person = new OrderDetailsDto();
        }

        public OrderDetailsDto.Builder withId(String address) {
            this.person.address = address;
            return this;
        }

        public OrderDetailsDto.Builder withFirstName(String phone) {
            this.person.phone = phone;
            return this;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void OrderDetailsDto(String address, String phone) {
            this.address = address;
            this.phone = phone;
        }


/*    public OrderDetailsDto() {
    }*/

    }
}
