package com.chrisferdev.pokedex_hexagonal.domain1.usecase4;

import com.chrisferdev.pokedex_hexagonal.domain1.api2.ITypeServicePort;
import com.chrisferdev.pokedex_hexagonal.domain1.model1.Type;
import com.chrisferdev.pokedex_hexagonal.domain1.spi3.ITypePersistencePort;

import java.util.List;

public class TypeUseCase implements ITypeServicePort {
    private final ITypePersistencePort typePersistencePort;

    public TypeUseCase(ITypePersistencePort typePersistencePort) {
        this.typePersistencePort = typePersistencePort;
    }

    @Override
    public Type saveType(Type type) {
        return typePersistencePort.saveType(type);
    }

    @Override
    public List<Type> getAllTypes() {
        return typePersistencePort.getAllTypes();
    }

    @Override
    public Type getType(Long typeId) {
        return typePersistencePort.getType(typeId);
    }

    @Override
    public void updateType(Type type) {
        typePersistencePort.updateType(type);
    }

    @Override
    public void deleteType(Long typeId) {
        typePersistencePort.deleteType(typeId);
    }
}
