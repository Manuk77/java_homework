package Enumeration.unit_ex5;

public enum Unit {
    METER("m"){
        @Override
        public String getBashUnit(String unitName) {

            switch (unitName){
                case "m":
                    return "m";
                case "kg":
                    return "kg";
                case "s":
                    return "s";
                case "A":
                    return "voltage /  Ohm";
                case "K":
                    return "K";
                case "mol":
                    return "mol";
                case "cd":
                    return "cd";
                default:
                    return "there is not the given unit!";
            }

        }
    },
    SECOND("s"){
        @Override
        public String getBashUnit(String unitName) {

            switch (unitName){
                case "m":
                    return "m";
                case "kg":
                    return "kg";
                case "s":
                    return "s";
                case "A":
                    return "voltage /  Ohm";
                case "K":
                    return "K";
                case "mol":
                    return "mol";
                case "cd":
                    return "cd";
                default:
                    return "there is not the given unit!";
            }

        }
    },
    KILOGRAM("kg"){
        @Override
        public String getBashUnit(String unitName) {

            switch (unitName){
                case "m":
                    return "m";
                case "kg":
                    return "kg";
                case "s":
                    return "s";
                case "A":
                    return "voltage /  Ohm";
                case "K":
                    return "K";
                case "mol":
                    return "mol";
                case "cd":
                    return "cd";
                default:
                    return "there is not the given unit!";
            }

        }
    },
    AMPERE("A"){
        @Override
        public String getBashUnit(String unitName) {

            switch (unitName){
                case "m":
                    return "m";
                case "kg":
                    return "kg";
                case "s":
                    return "s";
                case "A":
                    return "voltage /  Ohm";
                case "K":
                    return "K";
                case "mol":
                    return "mol";
                case "cd":
                    return "cd";
                default:
                    return "there is not the given unit!";
            }

        }
    },
    KELVIN("K"){
        @Override
        public String getBashUnit(String unitName) {

            switch (unitName){
                case "m":
                    return "m";
                case "kg":
                    return "kg";
                case "s":
                    return "s";
                case "A":
                    return "voltage /  Ohm";
                case "K":
                    return "K";
                case "mol":
                    return "mol";
                case "cd":
                    return "cd";
                default:
                    return "there is not the given unit!";
            }

        }
    },
    MOLE("mol"){
        @Override
        public String getBashUnit(String unitName) {

            switch (unitName){
                case "m":
                    return "m";
                case "kg":
                    return "kg";
                case "s":
                    return "s";
                case "A":
                    return "voltage /  Ohm";
                case "K":
                    return "K";
                case "mol":
                    return "mol";
                case "cd":
                    return "cd";
                default:
                    return "there is not the given unit!";
            }

        }
    },
    CANDELA("cd"){
        @Override
        public String getBashUnit(String unitName) {

            switch (unitName){
                case "m":
                    return "m";
                case "kg":
                    return "kg";
                case "s":
                    return "s";
                case "A":
                    return "voltage /  Ohm";
                case "K":
                    return "K";
                case "mol":
                    return "mol";
                case "cd":
                    return "cd";
                default:
                    return "there is not the given unit!";
            }

        }
    };

    private String unitName;

    Unit(String unitName){
        if(unitName != null && !unitName.isEmpty()){
            this.unitName = unitName;
        }
    }

    public String getUnitName() {
        return unitName;
    }

    public abstract String getBashUnit(String unitName);

}
