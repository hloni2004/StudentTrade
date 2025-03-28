package za.ac.cput.repository;



public interface IRepository<C ,ID> {

//C is for class ,whereby you can pass your class

C create (C c);

C read (ID id);

C update(C c);

Boolean delete(ID id);






}
