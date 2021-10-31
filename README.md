# coinmanager

made for the 2021 UMB Young Talents Hackathon as a part of our CharJar Discord Bot Project. Check it out here: https://github.com/DeNic0la/jda-discord-bot-starter

# HOW-TO-START-THE-APPLICATION for dummies

1. make sure u've got docker installed
2. `cd` into project folder
3. `docker-compose up` or `sudo docker-compose up` for linux users
4. make sure u've got gradle installed
5. run `gradle bootRun`
6. the application is now running on port `8080`

# Endpoints

GET `/users/{userId}/points`: get the users current balance
POST `/users/{userId}/points`: add or subtract points from user. body: { "action": "ADD" | "SUBTRACT", "amount": number }
