import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import model.Company;
import model.Security;
import model.Shares;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
//        Parser parser = new Parser();
//        Shares shares = parser.parse();

//        Company[] companies;
//        try (JsonReader reader = new JsonReader(new BufferedReader(new InputStreamReader(new FileInputStream("Shares.json"), "UTF-8")))) {
//
//            Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();
//
//            companies = gson.fromJson(reader, Company[].class);
//
//            Stream.of(companies).forEach(company ->
//                    {
//                        System.out.println(String.join("", "'", company.getName(), "' - '", company.getFounded().toString(), "'"));
//                    }
//            );
//        }
//
//
//        System.out.println("*********************************************");
//
//        List<Security> securities = getFilteringSecurities(companies, s -> s.getDate().isBefore(LocalDate.now()));
//        System.out.println(securities.size());
//        securities.forEach(System.out::println);
//
//        System.out.println("*********************************************");
//
//        LocalDate foundationDate = LocalDate.now().minusYears(50);//user input
//        List<Company> companiesByFoundationDate = getFilteringCompanies(companies, c -> c.getFounded().isAfter(foundationDate));
//        companiesByFoundationDate.forEach(System.out::println);
//
//
//    }
//
//    private static List<Security> getFilteringSecurities(Company[] companies, Predicate<Security> predicate) {
//        return Stream.of(companies)
//                .flatMap(c -> c.getSecurities().stream())
//                .filter(predicate)
//                .collect(Collectors.toList());
//    }
//
//    private static List<Company> getFilteringCompanies(Company[] companies, Predicate<Company> predicate) {
//        return Stream.of(companies)
//                .filter(predicate)
//                .collect(Collectors.toList());
//    }
//}



//        Parser parser = new Parser();
//        Shares shares = parser.parse();
//
//        ArrayList<Company> companies = new ArrayList<>(shares.getCompanies());
//
//        ArrayList<Security> securities = new ArrayList<>();
//        for (Company company : companies) {
//            securities.addAll(company.getSecurities());
//        }
//
//        ArrayList<String> currencies = new ArrayList<>();
//        for (Security security : securities) {
//            currencies.addAll(security.getCurrency());
//        }
//
//        System.out.println("Список компаний: ");
//        for (Company company : companies) {
//            company.getNameAndFoundationDate();
//        }
//
//        int count = 0;
//        System.out.println("\n" + "Список просроченных ценных бумаг: ");
//        for (Security security : securities) {
//            security.expiredSecuritiesPrintInfo();
//            count++;
//            for (Company company : companies) {
//                if (company.getSecurities().contains(security)) {
//                    System.out.println(" " + company.getName());
//                }
//            }
//        }
//        System.out.println("\n" + "Общее количество просроченных бумаг: " + count);
//
//        System.out.println("\n" + "Введите запрос:");
//
//        String currencyRub = "RUB";
//        String currencyEu = "EU";
//        String currencyUsd = "USD";
//        String userInsert = null;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            userInsert = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("\n");
//
//        DateCheck dateCheck = new DateCheck();
//        assert userInsert != null;
//        if (dateCheck.isValidDate1(userInsert)) {
//            SimpleDateFormat format = new SimpleDateFormat();
//            format.applyPattern("dd.MM.yyyy");
//            Date insertedDate = format.parse(userInsert);
//            for (Company company : companies) {
//                int result = insertedDate.compareTo(company.getFounded());
//                if (result < 0) {
//                    company.getNameAndFoundationDate();
//                }
//            }
//        } else if (dateCheck.isValidDate2(userInsert)) {
//            SimpleDateFormat format = new SimpleDateFormat();
//            format.applyPattern("dd.MM.yy");
//            Date insertedDate = format.parse(userInsert);
//            System.out.println(insertedDate);
//            for (Company company : companies) {
//                Date date = format.parse(company.getFounded().toString());
//                int result = insertedDate.compareTo(date);
//                if (result < 0) {
//                    company.getNameAndFoundationDate();
//                }
//            }
//        } else if (dateCheck.isValidDate3(userInsert)) {
//            SimpleDateFormat format = new SimpleDateFormat();
//            format.applyPattern("dd/MM/yyyy");
//            Date insertedDate = format.parse(userInsert);
//            for (Company company : companies) {
//                int result = insertedDate.compareTo(company.getFounded());
//                if (result < 0) {
//                    company.getNameAndFoundationDate();
//                }
//            }
//        } else if (dateCheck.isValidDate4(userInsert)) {
//            SimpleDateFormat format = new SimpleDateFormat();
//            format.applyPattern("dd/MM/yy");
//            Date insertedDate = format.parse(userInsert);
//            for (Company company : companies) {
//                int result = insertedDate.compareTo(company.getFounded());
//                if (result < 0) {
//                    company.getNameAndFoundationDate();
//                }
//            }
//        } else if (userInsert.equals(currencyRub)) {
//            for (Company company : companies) {
//                if (true) {
//                    System.out.println(company.getId() + " ");
//                }
//            }
//        } else if (userInsert.equals(currencyEu)) {
//            for (Company company : companies) {
//                for (Security security : securities) {
//                    if (security.getCurrency().contains(currencyEu)) {
//                        if (company.getSecurities().contains(security)) {
//                            System.out.println(company.getId() + " " + security.getCode());
//                        }
//                    }
//                }
//            }
//        }
//
////                    for (String currency: currencies) {
//////                        if (currency.contains("EU")) {
//////                            String a = currency.getBytes().toString();
//////                            System.out.println(company.getId() + " " + security.getCode());
//////                        }
////                }
////                }
////            }
////        }
//        else if (userInsert.equals(currencyUsd)) {
//
//        } else {
//            System.out.println("Введен неверный запрос" + "\n" +
//                    "Запрос может содержать только дату или валюту EU/USD/RUB");
//        }
//
//
//    }
//}