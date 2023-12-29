package Components.Players;
import java.util.Arrays;
import java.util.Random;

public class RandomDataGenerator {
    String[] _firstName =  new String[]
            { "Adam", "Alex", "Aaron", "Ben", "Carl",
                    "Dan", "David", "Edward", "Fred",
                    "Frank", "George", "Hal", "Hank",
                    "Ike", "John", "Jack", "Joe", "Larry",
                    "Monte", "Matthew", "Mark", "Nathan",
                    "Otto", "Paul", "Peter", "Roger", "Roger",
                    "Steve", "Thomas", "Tim", "Ty", "Victor",
                    "Walter"
            };

    String[] _lastName = new String[]
            { "Anderson", "Ashwoon", "Aikin", "Bateman",
                    "Bongard", "Bowers", "Boyd", "Cannon",
                    "Cast", "Deitz", "Dewalt", "Ebner", "Frick",
                    "Hancock", "Haworth", "Hesch", "Hoffman", "Kassing",
                    "Knutson", "Lawless", "Lawicki", "Mccord", "McCormack",
                    "Miller", "Myers", "Nugent", "Ortiz", "Orwig", "Ory",
                    "Paiser", "Pak", "Pettigrew", "Quinn", "Quizoz",
                    "Ramachandran", "Resnick", "Sagar", "Schickowski",
                    "Schiebel", "Sellon", "Severson", "Shaffer", "Solberg",
                    "Soloman", "Sonderling", "Soukup", "Soulis", "Stahl", "Sweeney",
                    "Tandy", "Trebil", "Trusela", "Trussel", "Turco", "Uddin",
                    "Uflan", "Ulrich", "Upson", "Vader", "Vail", "Valente",
                    "Van Zandt", "Vanderpoel", "Ventotla", "Vogal", "Wagle",
                    "Wagner", "Wakefield", "Weinstein", "Weiss", "Woo", "Yang",
                    "Yates", "Yocum", "Zeaser", "Zeller", "Ziegler", "Bauer",
                    "Baxster", "Casal", "Cataldi", "Caswell", "Celedon", "Chambers",
                    "Chapman", "Christensen", "Darnell", "Davidson", "Davis", "DeLorenzo",
                    "Dinkins", "Doran", "Dugelman", "Dugan", "Duffman", "Eastman", "Ferro",
                    "Ferry", "Fletcher", "Fietzer", "Hylan", "Hydinger", "Illingsworth",
                    "Ingram", "Irwin", "Jagtap", "Jenson", "Johnson", "Johnsen", "Jones",
                    "Jurgenson", "Kalleg", "Kaskel", "Keller", "Leisinger", "LePage",
                    "Lewis", "Linde", "Lulloff", "Maki", "Martin", "McGinnis", "Mills",
                    "Moody", "Moore", "Napier", "Nelson", "Norquist", "Nuttle",
                    "Olson", "Ostrander", "Reamer", "Reardon", "Reyes", "Rice",
                    "Ripka", "Roberts", "Rogers", "Root", "Sandstrom", "Sawyer",
                    "Schlicht", "Schmitt", "Schwager", "Schutz", "Schuster", "Tapia",
                    "Thompson", "Tiernan", "Tisler"
            };

    String[] _teamCities = new String[]
            { "Arizona", "Atlanta", "Baltimore", "Buffalo", "Carolina",
                    "Chicago", "Cincinnati", "Cleveland", "Dallas", "Denver",
                    "Detroit", "Green Bay", "Houston", "Indianapolis", "Jacksonville",
                    "Kansas City", "Los Angeles", "Miami", "Minnesota", "New England",
                    "New Orleans", "New York", "Oakland", "Philadelphia", "Pittsburgh",
                    "San Diego", "San Francisco", "Seattle", "Tampa Bay", "Tennessee",
                    "Washington"
            };

    String[] _teamMascots = new String[]
            { "Cardinals", "Falcons", "Ravens", "Bills", "Panthers",
                    "Bears", "Bengals", "Browns", "Cowboys", "Broncos",
                    "Lions", "Packers", "Texans", "Colts", "Jaguars",
                    "Chiefs", "Rams", "Dolphins", "Vikings", "Patriots",
                    "Saints", "Giants", "Raiders", "Eagles", "Steelers",
                    "Chargers", "49ers", "Seahawks", "Buccaneers", "Titans",
                    "Redskins"
            };

    public RandomDataGenerator(){}

    public String getRandomName(){
        Random rFirst = new Random();
        Random rLast = new Random();
        String firstName = _firstName[rFirst.nextInt(_firstName.length)];
        String lastName = _lastName[rLast.nextInt(_lastName.length)];
        return firstName + " " + lastName;
    }

    public int getRandomJerseyNumber(int[] existingJerseys){
        Random rJersey = new Random();
        int rNum = rJersey.nextInt(99);
        if (Arrays.asList(existingJerseys).contains(rNum)){
            getRandomJerseyNumber(existingJerseys);
        }
        return rNum;
    }

    public int getRandomRating(){
        Random rRating = new Random();
        return rRating.nextInt(99);
    }

    public String getRandomTeamCity(){
        Random rCity = new Random();
        return _teamCities[rCity.nextInt(_teamCities.length)];
    }

    public String getRandomTeamMascot(){
        Random rMascot = new Random();
        return _teamMascots[rMascot.nextInt(_teamMascots.length)];
    }
}
