package za.ac.cput.repository;



interface IRepository <Type , typeID> {

    Type create(Type type);

    Type update (Type type);

    Type read (typeID id);

    boolean delete (typeID id);

}
