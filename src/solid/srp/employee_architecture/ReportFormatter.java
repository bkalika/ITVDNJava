package solid.srp.employee_architecture;

public class ReportFormatter {
    String formatterOutput;

    public ReportFormatter(Object o, FormatType formatType){
        switch (formatType){
            case XML:
                formatterOutput = convertObjectToXML(o);
                break;
            case CSV:
                formatterOutput = convertObjectToCSV(o);
                break;
        }
    }

    private String convertObjectToXML(Object o){
        return "Converted to XML " + o.toString();
    }

    private String convertObjectToCSV(Object o){
        return "Converted to CSV " + o.toString();
    }
}
