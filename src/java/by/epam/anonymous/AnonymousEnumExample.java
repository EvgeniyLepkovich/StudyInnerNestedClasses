package by.epam.anonymous;

import java.util.Iterator;


//every instanse of enum below is anonymous
public enum AnonymousEnumExample {
    ADD {
        public double operation(double arg1, double arg2) {
            return arg1 + arg2;
        }
    },
    SUBSTRACT {
        public double operation(double arg1, double arg2) {
            return arg1 - arg2;
        }
    },
    MULTIPLY {
        public double operation(double arg1, double arg2) {
            return arg1 * arg2;
        }
    },
    DIVIDE {
        public double operation(double arg1, double arg2) {
            if (arg2 != 0) {
                return arg1 / arg2;
            } else {
                return 0;
            }
        }
    };

    public abstract double operation(double arg1, double arg2);
}
