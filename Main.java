        String[][] Persons = {{"Vasya", "Petya", "Kolya", "Sasha", "Sergey"}, {"123456", "4353435", "5643536","56434543","674534456"}};

        String NameToFind = "Petya";

        for(int i = 0; i < Persons[0].length; i++){

            if(Persons[0][i].equalsIgnoreCase(NameToFind)){

                System.out.println("Name " + NameToFind + " found where ID " +  Persons[1][i]);
                break;
            }

        }
