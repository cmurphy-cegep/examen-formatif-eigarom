# EXAMEN Formatif - Partie code 
## Instructions:

### Q1
- Déterminez quel est le patron de conception utilisé, et le problème qu'il règle dans le contexte de l'application.

RÉPONSE: Il s'agit du design pattern Command. Il permet de créer des actions et de journaliser leur exécution.

### Q2
- Complétez l'implémentation de l'app avec le patron *Façade*.

### Q3
- Quel principe SOLID ce code ne respecte-t-il pas ? (Un seul)

RÉPONSE: Interface Segregation Principle.
Chaque classe ne devrait implémenter que les méthodes dont elle a besoin.
Ici, la méthode fly ne devrait pas être implémentée à la classe penguin.