from __future__ import annotations

from settings import LaunchProfile, describe

class Launcher:
    def __init__(self, profile: LaunchProfile) -> None:
        self.profile = profile
        self.messages: list[str] = []

    def validate(self) -> bool:
        ok = self.profile.memory_mb >= 512
        self.messages.append("Memory check passed" if ok else "Memory must be at least 512MB")
        return ok

    def build_command(self) -> list[str]:
        return [self.profile.java, f"-Xmx{self.profile.memory_mb}m", "-jar", "koteldlc-safe-scaffold.jar"]

    def launch_demo(self) -> int:
        if not self.validate():
            print("\n".join(self.messages))
            return 1
        print(describe(self.profile))
        print("Command preview:", " ".join(self.build_command()))
        print("This launcher is a safe local scaffold and does not bypass authentication.")
        return 0
# project note 26: safe scaffold placeholder for local/client-side use only
# project note 27: safe scaffold placeholder for local/client-side use only
# project note 28: safe scaffold placeholder for local/client-side use only
# project note 29: safe scaffold placeholder for local/client-side use only
# project note 30: safe scaffold placeholder for local/client-side use only
# project note 31: safe scaffold placeholder for local/client-side use only
# project note 32: safe scaffold placeholder for local/client-side use only
# project note 33: safe scaffold placeholder for local/client-side use only
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
