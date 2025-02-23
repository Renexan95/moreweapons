import json
import shutil
import os

# Lista dei prefissi
materials = ["stone", "gold", "iron"]

# Funzione per aggiornare il contenuto del file JSON
def update_recipe(recipe, variant):
    replacements = {
        "stone": {
            "moreweapons:diamond_shard": "minecraft:iron_nugget",
            "minecraft:diamond": "minecraft:cobblestone",
            "moreweapons:diamond_": "moreweapons:stone_"
        },
        "iron": {
            "moreweapons:diamond_shard": "minecraft:iron_nugget",
            "minecraft:diamond": "minecraft:iron_ingot",
            "moreweapons:diamond_": "moreweapons:iron_"
        },
        "gold": {
            "moreweapons:diamond_shard": "minecraft:gold_nugget",
            "minecraft:diamond": "minecraft:gold_ingot",
            "moreweapons:diamond_": "moreweapons:gold_"
        }
    }

    updated_recipe = json.dumps(recipe)
    for old, new in replacements[variant].items():
        updated_recipe = updated_recipe.replace(old, new)

    return json.loads(updated_recipe)

# Funzione per creare le varianti dei file JSON
def create_variant_files():
    files = [f for f in os.listdir() if f.endswith(".json")]

    for file in files:
        base_name, _ = os.path.splitext(file)

        if "diamond" in base_name:
            with open(file, "r") as f:
                original_recipe = json.load(f)

            for material in materials:
                new_file_name = base_name.replace("diamond", material) + ".json"
                new_recipe = update_recipe(original_recipe, material)

                with open(new_file_name, "w") as f:
                    json.dump(new_recipe, f, indent=4)

                print(f"File creato: {new_file_name}")

# Chiamata alla funzione per creare le varianti
create_variant_files()
