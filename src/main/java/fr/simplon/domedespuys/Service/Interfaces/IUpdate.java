package fr.simplon.domedespuys.Service.Interfaces;

public interface IUpdate<T, D> {

    T update(String id, D dto);

}