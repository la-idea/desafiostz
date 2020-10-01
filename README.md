# Desafio Studio Z

Desafio para vaga de desenvolvedor na Studio Z. Foi testado com Postman no Body "raw" e "JSON(application/json)" no path /search/a
Também dá para consultar a API pelo path /search/{q}, sendo 'q' uma String que será buscada dentro da API do git.

## O Desafio

Criar uma aplicação com JAVA com Spring-Boot de consulta na API Pública do Github.

A aplicação deve conter um endpoint, sendo um método POST, que receberá um payload com os seguintes parâmentros.
{
    "search": "java",
    "sort": "starts",
    "order": "desc"
}

Com esses dados, o endpoint deverá consultar a API pública: https://api.github.com/search/repositories?q=java&sort=stars&order=desc

Basicamente, esta API retorna uma lista de repositórios a partir de uma string enviada na QueryString 'q'.
A documentação completada da API pode ser encontrada neste link: https://developer.github.com/v3/search/#search-repositories

A partir da resposta recebida da API do Github, o endpoint deve retornar montar um novo objeto (DTO) de resposta, que deve ser mapeados conforme o payload abaixo:

{
  "total_count": 1585659, // Campo Original: total_count
  "items": [
    {
        "id": 121395510, // Campo Original: items.id
        "name": "CS-Notes", // Campo Original: items.name
        "owner": "CyC2018" // Campo Original: items.owner.login
        "url": "https://..." // Campo Original: items.url
        "famous": true // Calcular, se items.stargazers_count > 100K ? true : false
    }
    ]
}


O projeto desenvolvido deve ser disponibilizado em um repositório público do Github ou afins.

