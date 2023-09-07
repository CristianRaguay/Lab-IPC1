/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author crist
 */
public class Item{
        private int id;
        private String value;

        public Item(int id, String value) {
            this.id = id;
            this.value = value;
        }

        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
}
