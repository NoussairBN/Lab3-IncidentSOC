# Lab 3 : Formulaire et Navigation - Édition Incident SOC

Ce projet est la réalisation du **Lab 3 - Programmation Mobile (Android)**. 
L'exercice classique de formulaire a été adapté en une interface de création de ticket d'incident pour un centre d'opérations de sécurité (SOC).

## Compétences techniques validées
- **Navigation entre activités :** Utilisation d'**Intent explicites** pour passer de l'écran de saisie au tableau de bord de récapitulatif.
- **Passage de données :** Utilisation des méthodes `putExtra()` et `getStringExtra()` pour transférer les données du formulaire de manière sécurisée.
- **Validation des entrées :** Blocage de l'envoi si les champs critiques sont vides (`isEmpty()`) et utilisation des `Regex` (Patterns) pour vérifier le format de l'adresse IP saisie.
- **Cycle de vie :** Utilisation de `finish()` pour détruire l'activité secondaire et revenir proprement à l'accueil.
- **UI/UX :** Utilisation du conteneur `ScrollView` pour s'adapter aux petits écrans et configuration des `inputType` adaptés (Texte, Email, Décimal).

## 📹 Démonstration Vidéo
*Remplissage du rapport, vérification IP, et génération du ticket sur le second écran :*
[Screen Recording 2026-04-06 042634.zip](https://github.com/user-attachments/files/26493844/Screen.Recording.2026-04-06.042634.zip)


