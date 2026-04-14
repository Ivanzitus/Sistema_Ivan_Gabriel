/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author u05661916108
 */
public abstract class DaoAbstract {
        public abstract void incert(Object object);
        public abstract void update(Object object);
        public abstract void delite(Object object);
        public abstract Object list(int id);
        public abstract Object listAll();
        
}
