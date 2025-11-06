import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Car {
    private String name;
    private String model;
    private String color;
    private double price;
    private int quantity;

    public Car(String name, String model, String color ,double price, int quantity) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }




    public int sell(){
        quantity=quantity-1;
        return 0;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, model, color,price,quantity);
//    }

}


