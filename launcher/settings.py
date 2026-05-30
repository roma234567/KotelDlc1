from __future__ import annotations

from dataclasses import dataclass
from pathlib import Path
import json

APP_NAME = "KotelDLC"
CONFIG_DIR = Path.home() / ".koteldlc"
CONFIG_FILE = CONFIG_DIR / "launcher.json"

@dataclass
class LaunchProfile:
    name: str = "Safe Scaffold"
    java: str = "java"
    memory_mb: int = 2048
    offline_demo: bool = True

    def as_dict(self) -> dict:
        return {"name": self.name, "java": self.java, "memory_mb": self.memory_mb, "offline_demo": self.offline_demo}


def ensure_config() -> LaunchProfile:
    CONFIG_DIR.mkdir(parents=True, exist_ok=True)
    if not CONFIG_FILE.exists():
        profile = LaunchProfile()
        CONFIG_FILE.write_text(json.dumps(profile.as_dict(), indent=2), encoding="utf-8")
        return profile
    data = json.loads(CONFIG_FILE.read_text(encoding="utf-8"))
    return LaunchProfile(**{**LaunchProfile().as_dict(), **data})


def describe(profile: LaunchProfile) -> str:
    return f"{APP_NAME}: {profile.name}, java={profile.java}, memory={profile.memory_mb}MB, offline_demo={profile.offline_demo}"
# project note 34: safe scaffold placeholder for local/client-side use only
# project note 35: safe scaffold placeholder for local/client-side use only
# project note 36: safe scaffold placeholder for local/client-side use only
# project note 37: safe scaffold placeholder for local/client-side use only
# project note 38: safe scaffold placeholder for local/client-side use only
# project note 39: safe scaffold placeholder for local/client-side use only
# project note 40: safe scaffold placeholder for local/client-side use only
# project note 41: safe scaffold placeholder for local/client-side use only
# project note 42: safe scaffold placeholder for local/client-side use only
# project note 43: safe scaffold placeholder for local/client-side use only
# project note 44: safe scaffold placeholder for local/client-side use only
# project note 45: safe scaffold placeholder for local/client-side use only
# project note 46: safe scaffold placeholder for local/client-side use only
# project note 47: safe scaffold placeholder for local/client-side use only
# project note 48: safe scaffold placeholder for local/client-side use only
# project note 49: safe scaffold placeholder for local/client-side use only
# project note 50: safe scaffold placeholder for local/client-side use only
