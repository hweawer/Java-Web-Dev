package edu.epam.second.entity.impl;

import edu.epam.second.entity.TextComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//todo: parametrization ?????
public class LexicalUnitComposite implements TextComponent<TextComponent> {
    private List<TextComponent> lexemParts;

    public LexicalUnitComposite(){
        lexemParts = new ArrayList<>();
    }

    @Override
    public String operation() {
        return lexemParts.stream().map(TextComponent::operation).collect(Collectors.joining());
    }

    @Override
    public boolean add(TextComponent component) {
        return lexemParts.add(component);
    }

    @Override
    public boolean remove(TextComponent component) {
        return lexemParts.remove(component);
    }
}