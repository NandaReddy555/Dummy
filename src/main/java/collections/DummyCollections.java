package collections;

import java.util.List;

public class DummyCollections {

    public void printEmployeeNamesInCapital(){
        List<String> employee=List.of("vamsi","gurumurthi","venky","vishnu","siri");
        List<String> namesInCapital=employee.stream().map(String::toUpperCase).toList();
        for(String output:namesInCapital){
            System.out.print(output+" ");
        }


    }

}
