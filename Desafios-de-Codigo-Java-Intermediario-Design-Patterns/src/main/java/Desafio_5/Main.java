package Desafio_5;

import java.util.Scanner;

// Antiga classe de conversão que só suporta a conversão de USD para GBP
class OldCurrencyConverter {
    public double convertUSDtoGBP(double amount) {
        return amount * 0.80; // 80% do valor em USD
    }
}
class GBPToEURConverter {
    public double convertGBPtoEUR(double amount){
        return amount * 1.0625;
    }
}

// Novo adaptador que usa a antiga conversão e aplica a taxa adicional de GBP para EUR
class CurrencyAdapter {
    private final OldCurrencyConverter oldConverter;
    private final GBPToEURConverter newConverter;

    public CurrencyAdapter(OldCurrencyConverter oldConverter, GBPToEURConverter newConverter) {
        this.oldConverter = oldConverter;
        this.newConverter = newConverter;
    }

    // Método de conversão de USD para outra moeda (por exemplo, JPY)
    public double convertUSDtoEUR(double amount) {
        double gbp = oldConverter.convertUSDtoGBP(amount);
        double eur = newConverter.convertGBPtoEUR(gbp);
        return eur;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        OldCurrencyConverter oldConverter = new OldCurrencyConverter();
        GBPToEURConverter newConverter = new GBPToEURConverter();
        CurrencyAdapter adapter = new CurrencyAdapter(oldConverter,newConverter);

        // Chamar o método para converter USD para a nova moeda desejada (por exemplo, JPY)
        double eur = adapter.convertUSDtoEUR(input);

        System.out.println("USD: " + input);
        System.out.println("EUR: " + eur);
    }
}
