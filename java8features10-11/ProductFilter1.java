import java.util.*;


class Product
{
    String name;
	double price;

    public Product(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
}

public class ProductFilter1
{
    public static void main(String[] args)
    {
        List<Product> list = new ArrayList<>();
        list.add(new Product("abc", 1));
        list.add(new Product("aa", 10));
        list.add(new Product("bb", 20));
        list.add(new Product("cc", 2));

        Double ans = list.stream().filter(p -> p.price < 10).mapToDouble
                (p -> p.price).average().orElse(0);

        System.out.println(ans);
    }
}

