package fr.simplon.domedespuys.Service.Interfaces;

public interface ICreatePurchaseProduct<T, P, D> {
    T createPurchaseProduct(P p, D dto);
}
